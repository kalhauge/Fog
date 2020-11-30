package domain.items;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Objects;

public class Customer {
    private static final int PASSWORD_ITERATIONS = 65536;
    private static final int PASSWORD_LENGTH = 256; // 32 bytes
    private static final SecretKeyFactory PASSWORD_FACTORY;

    static {
        SecretKeyFactory factory = null;
        try {
            factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        PASSWORD_FACTORY = factory;
    }

    String name;
    String address;
    String email;
    int phoneNumber;
    int customerID;
    private byte[] salt;
    private byte[] secret;

    public Customer(String name, String address, String email, int phoneNumber, int customerID, byte[] salt, byte[] secret) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.customerID = customerID;
        this.salt = salt;
        this.secret = secret;
    }

    public static byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }

    public static byte[] calculateSecret(byte[] salt, String password) {
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt,
                PASSWORD_ITERATIONS,
                PASSWORD_LENGTH);
        try {
            return PASSWORD_FACTORY.generateSecret(spec).getEncoded();
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean checkPassword(String password) {
        return Arrays.equals(this.secret, calculateSecret(salt, password)); }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }

    public int getCustomerID() { return customerID; }

    public void setCustomerID(int customerID) { this.customerID = customerID; }

    public byte[] getSalt() { return salt; }

    public void setSalt(byte[] salt) { this.salt = salt; }

    public byte[] getSecret() { return secret; }

    public void setSecret(byte[] secret) { this.secret = secret; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return phoneNumber == customer.phoneNumber &&
                customerID == customer.customerID &&
                Objects.equals(name, customer.name) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(email, customer.email) &&
                Arrays.equals(salt, customer.salt) &&
                Arrays.equals(secret, customer.secret);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, address, email, phoneNumber, customerID);
        result = 31 * result + Arrays.hashCode(salt);
        result = 31 * result + Arrays.hashCode(secret);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", customerID=" + customerID +
                ", salt=" + Arrays.toString(salt) +
                ", secret=" + Arrays.toString(secret) +
                '}';
    }
}


















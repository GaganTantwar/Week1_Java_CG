import java.util.*;
class OTPGenerator{

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates OTP between 100000 and 999999
    }

    // Method to generate 10 OTPs and store them in an array
    public static int[] generateMultipleOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to validate if all OTPs are unique
    public static boolean validateUniqueOTPs(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int i=0;i<otps.length;i++) {
            if (!otpSet.add(otps[i])) {
                return false; // Duplicate found
            }
        }
        return true; // All OTPs are unique
    }

    // Main method
    public static void main(String[] args) {
        int otpCount = 10;

        // Generate OTPs
        int[] otps = generateMultipleOTPs(otpCount);

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int i=0 ;i< otps.length;i++) {
            System.out.println(otps[i]);
        }

        // Validate uniqueness
        boolean allUnique = validateUniqueOTPs(otps);
        System.out.println("\nAre all OTPs unique? " + allUnique);
    }
}

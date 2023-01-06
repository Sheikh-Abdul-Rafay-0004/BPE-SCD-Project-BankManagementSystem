package main;

import java.util.Random;

public class PasswordRecovery {
  private static final int KEY_LENGTH = 16;
  private static final String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

  public static void main(String[] args) {
    // Generate a random password recovery key
    String key = generateKey();
    System.out.println("Generated key: " + key);
    
    String rekey = key ;
    System.out.println("Generated key: " + rekey);
    
  }

  public static String generateKey() {
    Random rng = new Random();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < KEY_LENGTH; i++) {
      int index = rng.nextInt(CHARSET.length());
      sb.append(CHARSET.charAt(index));
    }
    return sb.toString();
  }
}

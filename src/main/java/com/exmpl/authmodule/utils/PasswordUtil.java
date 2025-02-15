package com.exmpl.authmodule.utils;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtil {

    // Hash the password using BCrypt
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // Check if the raw password matches the hashed password
    public static boolean matchPassword(String rawPassword, String hashedPassword) {
        return BCrypt.checkpw(rawPassword, hashedPassword);

    }
}


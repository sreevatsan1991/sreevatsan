/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.email;

import java.security.SecureRandom;
import java.math.BigInteger;

public class PasswordGenerator {
  private SecureRandom random = new SecureRandom();

  public String getPassword() {
    return new BigInteger(5, random).toString(8);
  }
}
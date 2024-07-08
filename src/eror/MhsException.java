/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eror;

/**
 *
 * @author User
 */
public class MhsException extends Exception {

    /**
     * Creates a new instance of <code>MhsException</code> without detail
     * message.
     */
    public MhsException() {
    }

    /**
     * Constructs an instance of <code>MhsException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MhsException(String msg) {
        super(msg);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.proxy;

/**
 *
 * @author harshavardhan.reddy
 */
public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws Exception {
       Runtime.getRuntime().exec(cmd);
        System.out.println("' "+cmd+" '"+" Command Executed...");
    }
    
}

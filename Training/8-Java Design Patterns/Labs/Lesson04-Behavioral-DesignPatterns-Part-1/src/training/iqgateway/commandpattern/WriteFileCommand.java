/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.commandpattern;

/**
 *
 * @author harshavardhan.reddy
 */
public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystemRef;
    
    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystemRef=fs;
    }
    
    @Override
    public void ececute() {
        //Write command pattern forwards request to writeFile method
        this.fileSystemRef.writeFile();
    }
    
}

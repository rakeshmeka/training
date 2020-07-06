//			iostreams
/*     			   |
		       	   |
                         /    \ 
         (byte)byte stream     character stream(bit)
       >inputstream             >reader
       >outputstream            >writer

INPUTESTREAM:

 *byteArrayInputStream
 *SequenceInputStream
 *PipedInputStream
 *ObjectedInputStream
 *FileInputStream
 *FilterInputStream
     |->Buffered 
     |->DataInputStream
     |->PushBackInputStream
OUTPUTSTREAM:

 *ByteArrayOutputStream
 *PipedOutputSream
 *ObjectOutputStream
 *FileOutputStream
 *FilterOutputStream
    |->BufferedOutputStream
    |->DataOutputStream

READER:

 *BufferedReader
 *PipedReader
 *StringReader
 *FilterReader
 *InputStreamReader
 *charArrayReader
 *FileReader

WRITER:

 *BufferedWriter
 *PipedWriter
 *StringWriter
 *pipedWriter
 *FilterWriter
 *OutputWriter
 *CharArrayWriter
 *FileWriter

FILE            java.io.package;
----> File <object>=new File("test.txt");
METHOD:
     * object.getName()
     * object.getPath()
     * object.exists()
     * object.length()
     * object.lastModified()
test-----> isFile()
           isDirectory()

read()
write()
flush()
close()


PROGRAM TO PRINT THE CONTENTS& READ THE CONTENTS:
*/

import java.io.*;
import java.util.*;
public class files
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String fname=br.readLine();
FileOutputStream fos=new FileOutputStream(fname);
BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Read the character to print int file:");
String str=br1.readLine();
for(int i=0;i<str.length();i++)
{
fos.write(str.charAt(i));
}
fos.close();
//read the contents from a file
FileInputStream fis=new FileInputStream(fname);
int read;
while((read=fis.read())!=-1)
{
System.out.println((char)read);
}
fis.close();
}
}




// I cannot get the apache commons lang3 to install 
// I downloaded the binaries and tried to install the JAR file but I get an error 
// asking me to see the console except I cannot see the console
// I download the source to see if I could copy the file and use it 
// but that was a foolish idea as it has many dependencies
// import org.apache.commons.lang3.NotImplementedException;


public class BoardFactory{
   public static BoardReader boardReader(String filePath) throws Exception{
      
      // after looking at the instructor's code for SudokuBoard 2 I realized I had
      // missed out on the fileExtension not existing at all
      // I fixed this
      
      int i = filePath.lastIndexOf('.'); // copied from professor kelsiec's solution
           
      // if i > 0 (this means that the file extension for the fileType does exist) 
      if(i>0){
               
         String fileType = filePath.substring(i + 1); // only getting the extension (no . included)
               
         if(fileType.equals("ss")){
            return new SsReader();
         }
         else if(fileType.equals("sdk")){
            return new SdkReader();
         }
               //throw new NotImplementedException("File Type ." + fileType + " not supported"  );
         throw new Exception("File Type ." + fileType + " not supported");
      }
              // throw new UnsupportedOperationException("File has no extension.");           
      throw new Exception("File has no extension.");
   }
}
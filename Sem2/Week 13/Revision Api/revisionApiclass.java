public class revisionApiclass
{
  public static String encrypt(String text, int key)
  {
      String encrypted = "";
      
      for(int i = 0; i < text.length(); i++)
      {
         char ch = text.charAt(i); //get the next letter
         char codeCh = (char)(ch + key); //shife 'key' letters - not cast
         encrypted += codeCh; //append coded letter to encrypted
      }
      
      return encrypted;
  }
}
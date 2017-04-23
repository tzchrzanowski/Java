public class RnaTranscription {
    public String ofDna(String dnaString) {
      String tempStr = "";
      for (char characterat : dnaString.toCharArray()) {
        switch (characterat) {
          case 'C': tempStr += "G";
          break;
          case 'G': tempStr += "C";
          break;
          case 'A': tempStr += "U";
          break;
          case 'T': tempStr += "A";
          break;
          default: tempStr += "";
          break;
        }
      }
      return tempStr;
    }
}
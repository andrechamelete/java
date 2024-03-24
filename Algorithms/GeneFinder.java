class GeneFinder {

    public static String dnaSequence (String code) {

        String prime = "AGT";
        String end = "TAA";
        String gene = "abc";   
        
        for (int i = 0; i < code.length(); i+=3) {            
            if (code.substring(i, i+3).equals(prime)) {
                for (int j = i+3; j < code.length(); j+=3) {
                    if (code.substring(j, j+3).equals(end)) {
                        gene = code.substring(i, j+3);
                        return gene;
                    }
                }                
            }            
        }
        return gene;        
    }


    public static void main(String[] args) {
        
        String dna = "CGAAGTGATCTCGTAACGTAACCGGAT";
    
        System.out.println(GeneFinder.dnaSequence(dna));       
    }
}
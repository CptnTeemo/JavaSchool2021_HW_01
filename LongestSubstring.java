package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 3 (dnm)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        //Task implementation
        if(checkString == null){
            return 0;
        }

        String maxStr = "";
        String tempStr = "";
        for(int i=0; i < checkString.length(); i++){
            if(tempStr.contains("" + checkString.charAt(i))){
                tempStr = tempStr.substring(tempStr.lastIndexOf(checkString.charAt(i)) + 1);
            }

            tempStr = tempStr + checkString.charAt(i);

            if(maxStr.length() < tempStr.length()){
                maxStr = tempStr;
            }
        }

        return maxStr.length();
    }
}

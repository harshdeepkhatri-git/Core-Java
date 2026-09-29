package com.Strings.PractiseQuestion;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        System.out.println(longestUniqueSubstringLength("abcabcbb")); // 3
    }


    public static int longestUniqueSubstringLength(String s) {
            int longest = 0;

            for (int start = 0; start < s.length(); start++) {
                for (int end = start; end < s.length(); end++) {
                    boolean repeated = false;

                    for (int i = start; i < end; i++) {
                        if (s.charAt(i) == s.charAt(end)) {
                            repeated = true;
                            break;
                        }
                    }

                    if (repeated) {
                        break;
                    }

                    int length = end - start + 1;
                    if (length > longest) {
                        longest = length;
                    }
                }
            }

            return longest;
        }


    }


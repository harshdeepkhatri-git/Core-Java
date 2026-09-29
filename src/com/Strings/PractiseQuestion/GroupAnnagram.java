package com.Strings.PractiseQuestion;

public class GroupAnnagram {

        public static void main(String[] args) {
            String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
            boolean[] grouped = new boolean[words.length];

            for (int i = 0; i < words.length; i++) {
                if (grouped[i]) {
                    continue;
                }

                System.out.print("[" + words[i]);

                for (int j = i + 1; j < words.length; j++) {
                    if (!grouped[j] && areAnagrams(words[i], words[j])) {
                        System.out.print(", " + words[j]);
                        grouped[j] = true;
                    }
                }

                System.out.println("]");
                grouped[i] = true;
            }
        }

        public static boolean areAnagrams(String first, String second) {
            if (first.length() != second.length()) {
                return false;
            }

            int[] count = new int[26];

            for (int i = 0; i < first.length(); i++) {
                count[first.charAt(i) - 'a']++;
                count[second.charAt(i) - 'a']--;
            }

            for (int value : count) {
                if (value != 0) {
                    return false;
                }
            }

            return true;
        }
    }


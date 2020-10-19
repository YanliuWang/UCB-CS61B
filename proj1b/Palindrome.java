
/**
 * @author yanliu
 * @create 2020-10-19-10:08
 */
public class Palindrome {
    public Deque<Character> wordToDeque(String word) {
        Deque<Character> characterDeque = new LinkedListDeque<>();

        char[] words = word.toCharArray();

        for (char ch : words) {
            characterDeque.addLast(ch);
        }

        return characterDeque;

    }

    public boolean isPalindrome(String word) {
        int left = 0, right = word.length()-1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;

    }

    public boolean isPalindrome(String word, CharacterComparator cc) {
        int left = 0, right = word.length()-1;

        while (left < right) {
            if (cc.equalChars(word.charAt(left), word.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

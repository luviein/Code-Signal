import java.util.HashSet;

public class Main {
    public static char solution(String s) {
        HashSet<Character> repeating = new HashSet<>();
        HashSet<Character> nonRepeating = new HashSet<>();
        char[] charArray = s.toCharArray();
        for(char letter : charArray) {
            if(repeating.contains(letter)) {
                continue;
            } else if (nonRepeating.contains(letter)) {
                nonRepeating.remove(letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        System.out.println(nonRepeating);
        for(char unique : charArray) {
            if(nonRepeating.contains(unique))
            return unique;
        }
        return '_';

    }

    public static void main(String[] args) {
        System.out.println(solution("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"));
    }
    
}
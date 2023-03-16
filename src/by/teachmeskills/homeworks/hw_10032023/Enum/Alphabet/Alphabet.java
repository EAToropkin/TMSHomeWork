package by.teachmeskills.homeworks.hw_10032023.Enum.Alphabet;

public enum Alphabet {A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y;

    public static int getLetterPosition(String letter) {
        int pos = 0;

        try {
            pos = Alphabet.valueOf((letter.toUpperCase())).ordinal() + 1;
        } catch (IllegalArgumentException e) {
            System.out.println("Символ " + letter + " отсутствует в алфавите");
        }
        return pos;
    }
}



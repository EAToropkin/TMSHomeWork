package by.teachmeskills.homeworks.hw_10032023.Enum.Alphabet;

public enum Alphabet {
    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y;

    public int getLetterPosition() {
        return ordinal() + 1;
    }
}



class Solution {
  int [][]dir = new int [][] { {-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    Stack<Pair> st = new Stack<>();
    public boolean exist(char[][] board, String word) {

        for (int   i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                st.push(new Pair(i, j));
                boolean isExist = traverse(board, i, j, word, "");
                               st.pop();
                if (isExist)
                    return true;
            }
        }
        return false;
    }

    public boolean traverse(char[][] board, int x, int y, String word, String ans) {

        if (ans.length() > word.length())
            return false;

        if (word.length() == ans.length() && word.equals(ans))
            return true;

        if (word.startsWith(ans)) {

            char c = board[x][y];

            if (!word.startsWith(ans + c))
                return false;

                        if (word.equals(ans + c))
                return true;

            boolean isExist = false;
            for (int[] ints : dir) {
                int newX = x + ints[0];
                int newY = y + ints[1];

                if (newX >= 0 && newX < board.length && newY >= 0 && newY < board[0].length) {
                    if (st.isEmpty() || !st.contains(new Pair(newX, newY))) {
                        st.push(new Pair(newX, newY));
                        isExist = isExist || traverse(board, newX, newY, word, ans + c);
                        st.pop();
                    }
                }
            }
            return isExist;
        } else
            return false;

    }

    static class Pair extends Object {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Pair))
                return false;
            return this.x == ((Pair)obj).x && this.y == ((Pair)obj).y;
        }
    }
}

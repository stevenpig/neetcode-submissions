class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

       int ate = 0;

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < students.length; i++) {
            q.add(students[i]);
        }

        Set<Integer> notEat = new HashSet<>();
        int stu = 0;
        while (!q.isEmpty() && (notEat.isEmpty() || notEat.size() != q.size())) {
            if (q.peekFirst() == sandwiches[ate]) {
                q.removeFirst();
                ate++;
                stu=0;
                notEat.clear();
            } else {
                int r = q.removeFirst();
                q.add(r);
                notEat.add(++stu);
            }
        }

        return sandwiches.length - ate  ;
    }
}
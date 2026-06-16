class BrowserHistory {
    private int cnt = 0;
    private ArrayList<String> page = new ArrayList<>();
    public BrowserHistory(String homepage) {
        cnt = 1;
        page.add(homepage);
    }

    public void visit(String url) {
        if (page.size() > cnt)
            page.set(cnt, url);
        else
            page.add(url);
        cnt++;
    }

    public String back(int steps) {
        int i = 0;
        if (cnt - steps <= 0)
            return page.getFirst();
        cnt -= steps;
        return page.get(cnt - 1);
    }

    public String forward(int steps) {
        int i = 0;
        if (cnt + steps >= page.size())
            return page.getLast();
        cnt += steps;
        return page.get(cnt - 1);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
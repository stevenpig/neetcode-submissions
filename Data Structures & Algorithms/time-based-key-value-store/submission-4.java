class TimeMap {

  Map<String, String[]> m = new HashMap<>();

    public TimeMap() {
        
    }
       public void set(String key, String value, int timestamp) {
        String[] l = m.getOrDefault(key, new String[1000000]);
        System.out.println(l.length + " " + timestamp);
        l[timestamp - 1] = value;
        m.put(key, l);
    }

    public String get(String key, int timestamp) {
        if (!m.containsKey(key))
            return "";
        else {
            String[] l = m.get(key);
            for (int i = timestamp - 1; i >=0 ; i--) {
                if (l[i] != null)
                    return l[i];
            }
            return "";
        }
    }
}

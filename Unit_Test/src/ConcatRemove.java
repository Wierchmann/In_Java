class concatRemove {
    /**
     * @param s
     * @param t
     * @param k
     * @return
     */
    public static String concatRemove(String s, String t, int k) {
        int len_s = s.length();
        int len_t = t.length();
        if (len_s >= len_t) {
            s = s.substring(0, len_s - (len_s - len_t));
        }
        if (s.equals(t)) {
            return "yes";
        }
        if (k == (len_t - len_s)) {
            if (s + t.substring(len_s).equals(t) != null) {
                return "yes";
            }
        }
        return "no";
    }
    //Testing :
    public static void main(String[] args) {
        System.out.println(concatRemove("bla bla bla bla", "blablabcde", 8)); 
        System.out.println(concatRemove("tab", "tab", 7));
        System.out.println(concatRemove("dragon", "spider", 6));
        System.out.println(concatRemove("no easter egg", "easter egg", 6));
        System.out.println(concatRemove("same", "same", 2));   
    }



}

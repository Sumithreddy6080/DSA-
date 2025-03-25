class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < command.length()) {
            char ch = command.charAt(i);
            if (ch == 'G') {
                sb.append("G");
                i++;
            } else if (ch == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append("o");
                    i = i + 2;
                } else {
                    sb.append("al");
                    i = i + 4;
                }
            }
        }

        return sb.toString();
    }
}
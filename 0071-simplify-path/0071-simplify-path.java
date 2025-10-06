class Solution {
    public String simplifyPath(String path) {
        LinkedList<String> stack = new LinkedList<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.removeLast();
                }
            } else {
                stack.addLast(part);
            }
        }

        if (stack.isEmpty()) return "/";

        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {  
            sb.append("/").append(dir);
        }
        return sb.toString();
    }
}

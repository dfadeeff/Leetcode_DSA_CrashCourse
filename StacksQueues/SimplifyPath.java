package StacksQueues;

import java.util.ArrayList;

public class SimplifyPath {
    public String simplifyPath(String path) {
        var dirs = new ArrayList<String>();
        for (var dir : path.split("/")) {
            if (dir.isEmpty() || dir.equals(".")) {
                continue;
            }
            if (dir.equals("..")) {
                if (!dirs.isEmpty()) {
                    dirs.remove(dirs.size() - 1);
                }
            } else {
                dirs.add(dir);
            }
        }
        return "/" + String.join("/", dirs);
    }


    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        String path1 = "/home/";
        System.out.println(simplifyPath.simplifyPath(path1));
        String path2 = "/home//foo/";
        System.out.println(simplifyPath.simplifyPath(path2));
    }
}

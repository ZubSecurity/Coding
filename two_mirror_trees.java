class Tree {
    boolean areMirror(Node a, Node b) {
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        //System.out.println(a.data+" "+b.data);
        if(a.data == b.data && areMirror(a.left,b.right) && areMirror(a.right,b.left)){
            return true;
        }
        return false;
    }
}

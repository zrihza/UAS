package UAS;

class Node {
    int data;
    String name;
    String penyakit;
    Node left;
    Node right;

    public Node(int data, String name, String penyakit) {
        this.data = data;
        this.name = name;
        this.penyakit = penyakit;
        left = right = null;
    }
}

package class2_Graph;

public class Vertex {
    int label;

    Vertex(int label) {
        this.label = label;
    }

    public int getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object vertex) {
        if (this == vertex) {
            return true;
        }
        Vertex otherVertex = (Vertex) vertex;
        return getLabel() == otherVertex.getLabel();
    }

    @Override
    public int hashCode(){
        return getLabel();
    }
}

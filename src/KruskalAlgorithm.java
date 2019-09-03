import org.graphstream.algorithm.Kruskal;
import org.graphstream.algorithm.generator.DorogovtsevMendesGenerator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.DefaultGraph;

public class KruskalAlgorithm {
    public static void main(String[] args){
        //        최소 비용 신장트리 생성 - 크루스칼 알고리즘

        //        가중치로 간선을 정렬한 후 사이클이 형성되지 않도록 간선을 하나씩 선택 또는
        //        삭제하며 신장트리 그래프를 만들어감


        //        Dorogovtsev-Mendes 생성기로 그래프를 생성 한 다음 Kruskal 알고리즘을 사용하여 스패닝 트리를 계산.
        //        생성기는 Kruskal 알고리즘에서 사용할 모서리에 대해 임의 가중치를 생성.
        //        가중치가 없으면 알고리즘은 모든 가중치가 1로 설정된 것으로 간주.
        DorogovtsevMendesGenerator gen = new DorogovtsevMendesGenerator();
        Graph graph = new DefaultGraph("Kruskal Test");

        //        스패닝 트리에 에지가 있으면 알고리즘은 "ui.class"속성을 "intree"로 설정하고 그렇지 않은 경우 속성은 "notintree"로 설정.
        //        정의 된 CSS 스타일 시트에 따라 스패닝된 엣지는 굵은 검은 선으로 표시되고 스패닝 트리에 없는 엣지는 얇은 회색 선으로 표시.

        String css = "edge .notintree {size:1px;fill-color:gray;} " +
                "edge .intree {size:3px;fill-color:black;}";

        graph.addAttribute("ui.stylesheet", css);
        graph.display();

        gen.addEdgeAttribute("weight");
        gen.setEdgeAttributesRange(1, 100);
        gen.addSink(graph);
        gen.begin();

        for (int i = 0; i < 100 && gen.nextEvents(); i++);
        gen.end();

        Kruskal kruskal = new Kruskal("ui.class", "intree", "notintree");

        kruskal.init(graph);
        kruskal.compute();

        //Kruskal Algorithm Complexity : m*(log(m)+3)+n+n2, m = |E|, n = |V|
    }
}

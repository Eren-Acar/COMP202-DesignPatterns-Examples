package BehavioralDesignPatterns.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Map {
	
	private List<Node> nodes = new ArrayList<Node>();
	
	public void addNode(Node node) {
        if (!nodes.contains(node))
        	nodes.add(node);
    }
	
	public List<Node> getNodes() {
        return nodes;
    }
	}



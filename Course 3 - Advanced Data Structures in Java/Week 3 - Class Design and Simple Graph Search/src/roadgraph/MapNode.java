package roadgraph;

import java.util.ArrayList;
import java.util.List;

import geography.GeographicPoint;

public class MapNode {

	private GeographicPoint location;
	private double currentDistance;
	private double currentHeuristicDistance;
	private List<MapEdge> edges = new ArrayList<MapEdge>();
	
	public MapNode(GeographicPoint location) {
		this.location = location;
		this.currentDistance = Double.POSITIVE_INFINITY;
		this.currentHeuristicDistance = Double.POSITIVE_INFINITY;
	}
	
	public List<GeographicPoint> getNeighbors() {
		List<GeographicPoint> neighbors = new ArrayList<>();
		for(MapEdge e : edges) {
			neighbors.add(e.getEnd());
		}
		
		return neighbors;
	}
	
	public GeographicPoint getLocation() {
		return location;
	}
	
	public double getCurrentDistance() {
		return currentDistance;
	}
	
	public void setCurrentDistance(double currentDistance) {
        this.currentDistance = currentDistance;
    }

    public double getCurrentHeuristicDistance() {
        return currentHeuristicDistance;
    }

    public void setCurrentHeuristicDistance(double currentHeuristicDistance) {
        this.currentHeuristicDistance = currentHeuristicDistance;
    }
    
    public List<MapEdge> getEdges() {
        return edges;
    }

    public void setEdges(List<MapEdge> edges) {
        this.edges = edges;
    }
    
    public void addEdge(MapEdge edge) {
    	this.edges.add(edge);
    }
    
    public String toString() {
    	return location.toString();
    }
	
}

package roadgraph;

import geography.GeographicPoint;

public class MapEdge {
	private GeographicPoint start;
	private GeographicPoint end;
	private String streetName;
	private String roadType;
	private Double distance;
	
	public MapEdge(GeographicPoint start, GeographicPoint end, String streetName, String roadType, double distance) {
		this.start = start;
		this.end = end;
		this.streetName = streetName;
		this.roadType = roadType;
		this.distance = distance;
	}
	
	public GeographicPoint getStart() {
        return start;
    }

    public GeographicPoint getEnd() {
        return end;
    }

    public String getStreetName() {
        return streetName;
    }
    
    public String getRoadType() {
    	return roadType;
    }

    public double getDistance() {
        return distance;
    }
}

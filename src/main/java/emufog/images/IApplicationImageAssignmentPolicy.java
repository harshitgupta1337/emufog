package emufog.images;

import emufog.graph.Graph;
import emufog.settings.Settings;

public interface IApplicationImageAssignmentPolicy {
	public void generateImageMapping(Graph graph, Settings settings); 
	public void generateCommandsLists(Graph graph, Settings settings);
}

package docker.emufog;

/**
 * This docker image represents a fog computing node in the topology.
 * It can serve a fixed number of clients and is associated with deployment costs.
 */
public class FogType extends DockerType {

    /* maximal number of clients this image can serve, including */
    public final int maxClients;

    /* costs to deploy an instance of this image */
    public final float costs;

    /**
     * Creates a new fog computing node to be deployed in the network.
     *
     * @param dockerImage actual docker image to deploy
     * @param maxClients  maximum number of clients to serve
     * @param costs       costs to deploy this image
     * @param memoryLimit upper limit of memory to use in Mb
     * @param cpuShare    share of the sum of available computing resources
     * @throws IllegalArgumentException the docker image name cannot be null and must
     *                                  match the pattern of a docker container name
     */
    public FogType(String dockerImage, int maxClients, float costs, int memoryLimit, float cpuShare) throws IllegalArgumentException {
        super(dockerImage, memoryLimit, cpuShare);

        this.maxClients = maxClients;
        this.costs = costs;
    }
}
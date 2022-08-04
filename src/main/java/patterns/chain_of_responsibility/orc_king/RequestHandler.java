package patterns.chain_of_responsibility.orc_king;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class RequestHandler {

    private final RequestHandler next;

    protected RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }

    protected void printHandling(Request request) {
        LOGGER.info("{} handling request \"{}\"", this, request);
    }

    @Override
    public abstract String toString();
}

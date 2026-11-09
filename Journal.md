Phase 1
I created the MediaItem interface, RealMedia class, and RemoteMediaProxy. I learned how the proxy uses a common interface to communicate with a remote object and a boolean to ensure the connection only happens once.

Phase 2
I created a VirtualMediaProxy that uses lazy loading to delay creating RealMedia until it is needed. Unlike the Remote Proxy, it focuses on saving memory by only loading assets once.

Phase 3
I tested both proxies and confirmed they only connect or load once. I learned how the Proxy Pattern controls access to objects while keeping the same interface.
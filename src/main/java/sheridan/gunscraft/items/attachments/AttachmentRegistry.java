package sheridan.gunscraft.items.attachments;

import java.util.HashMap;
import java.util.Map;

public class AttachmentRegistry {
    private static Map<Integer, IGenericAttachment> registryMap = new HashMap<>();

    public static void register(int id, IGenericAttachment attachment) {
        if (!registryMap.containsKey(id)) {
            registryMap.put(id, attachment);
        }
    }

    public static IGenericAttachment get(int id) {
        return registryMap.getOrDefault(id, null);
    }
}

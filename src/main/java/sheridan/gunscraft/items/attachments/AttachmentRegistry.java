package sheridan.gunscraft.items.attachments;

import sheridan.gunscraft.model.IAttachmentModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static sheridan.gunscraft.items.attachments.GenericAttachment.NONE;

public class AttachmentRegistry {
    private static Map<Integer, IGenericAttachment> registryMap = new HashMap<>();
    private static Map<String, Integer> IDMap = new HashMap<>();
    private static Map<Integer, IAttachmentModel> modelMap = new HashMap<>();
    private static int ID = -1;

    public static void register(int id, IGenericAttachment attachment) {
        if (!registryMap.containsKey(id)) {
            registryMap.put(id, attachment);
        }
    }
    public static int getIdByName(String name) {
        return IDMap.getOrDefault(name, NONE);
    }

    public static void registerModel(int id, IAttachmentModel models) {
        if (!modelMap.containsKey(id)) {
            modelMap.put(id, models);
        }
    }

    public static IAttachmentModel getModel(int id) {
        return  modelMap.getOrDefault(id, null);
    }

    public static IGenericAttachment get(int id) {
        return registryMap.getOrDefault(id, null);
    }

    public static int getID(String name) {
        synchronized (Object.class) {
            ++ID;
            IDMap.put(name, ID);
            return ID;
        }
    }
}

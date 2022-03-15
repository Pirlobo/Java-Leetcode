// public void getItem(Item i, int quantity) {
//     int id = items.indexOf(i);
    
//     if (id != -1) {
//             ItemCollection ik = items.get(id);
//             items.set(id, new ItemCollection(ik.item, ik.qty + quantity));
//     }
//     else
//             items.add(new ItemCollection(i, quantity));
    
//     if (i.IsQuestItem()) {
//             id = questItems.indexOf(i);
//             if (id != -1) {
//                     ItemCollection ik = questItems.get(id);
//                     questItems.set(id, new ItemCollection(ik.item, ik.qty + quantity));
//             }
//             else
//                     questItems.add(new ItemCollection(i, quantity));
//     }
//     else {
//             id = normalItems.indexOf(i);
//             if (id != -1) {
//                     ItemCollection ik = normalItems.get(id);
//                     normalItems.set(id, new ItemCollection(ik.item, ik.qty + quantity));
//             }
//             else
//                     normalItems.add(new ItemCollection(i, quantity));
//     }
    
//     lastItemCollected = i;
    
//     AchievementSystem.instance.DidModifyItem("gain", i.identifier, quantity);
//     didPickupItem(i);
    
// }

// public void loseItem(Item i, int quantity) {
//     int id = items.indexOf(i);
    
//     if (id != -1) {
//             ItemCollection ik = items.get(id);
//             items.set(id, new ItemCollection(ik.item, ik.qty - quantity));
//             if (items.get(id).qty <= 0)
//                     items.remove(id);
//     }
    
//     if (i.IsQuestItem()) {
//             id = questItems.indexOf(i);
//             if (id != -1) {
//                     ItemCollection ik = questItems.get(id);
//                     questItems.set(id, new ItemCollection(ik.item, ik.qty - quantity));
//             }
//             if (questItems.get(id).qty <= 0)
//                     questItems.remove(id);
//     }
//     else {
//             id = normalItems.indexOf(i);
//             if (id != -1) {
//                     ItemCollection ik = normalItems.get(id);
//                     normalItems.set(id, new ItemCollection(ik.item, ik.qty - quantity));
//             }
//             if (normalItems.get(id).qty <= 0)
//                     normalItems.remove(id);
//     }
    
//     AchievementSystem.instance.DidModifyItem("lose", i.identifier, quantity);
// }
// Classes used:

// class Item {
//     private String name;
//     private boolean isQuestItem;
    
//     public Item(String name, boolean isQuestItem) {
//             this.name = name;
//             this.isQuestItem = isQuestItem;
//     }
    
//     public boolean IsQuestItem() {
//             return isQuestItem;
//     }
    
//     public String toString() {
//             return "Name: " + name + "\nQuestion Item: " + isQuestItem;
//     }
// }

// class ItemCollection {
//     Item item;
//     int qty;
    
//     public ItemCollection(Item item, int qty) {
//             this.item = item;
//             this.qty = qty;
//     }
    
//     public boolean equals(Object o) {
//             Item i = (Item) o;
//             return this.item == i;
//     }
    
// }
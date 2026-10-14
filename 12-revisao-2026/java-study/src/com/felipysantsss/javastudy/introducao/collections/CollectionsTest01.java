package com.felipysantsss.javastudy.introducao.collections;

import com.felipysantsss.javastudy.introducao.collections.domain.User;

public class CollectionsTest01 {
    public static void main(String[] args) {
         User user1 = new User("Felipy", 17);
         User user2 = new User("Felipy", 17);

         System.out.println(user1.equals(user2));
    }
}

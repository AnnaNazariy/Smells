1. LargeClass:
   - Великий клас: містить багато полів та методів, відповідальних за різні аспекти.
   - Дублювання коду: декілька методів (`addFriend`, `removeFriend`, `addEnemy`, `removeEnemy`, `addTask`, `removeTask`) мають схожу структуру.
2. Order:
   - Довгі методи: метод `processOrder()` містить багато коду та може бути складним для розуміння.
   - Використання примітивних типів: метод `calculateTotalPrice()` оперує примітивним типом `double`, що може бути менш гнучким.
3. UserListProcessor:
   - Довгий метод: `processUserList()` містить багато коду та може бути складним для розуміння.
   - Primitive Obsession: використання примітивного типу `int` для підрахунку адміністраторів.
   - Long Parameter List: метод `addUser` має довгий список параметрів, що може бути незручним у використанні.
   - Data Clumps: параметри `username` та `email` повторюються в методі `sendEmailToUser`.


# Fourth Product Family Extension

The fourth product family added to the system is Horror.

## New files

The following files were added:

- HorrorVisual.java
- HorrorSound.java
- HorrorEditing.java
- HorrorProductionFactory.java

## Modified files

The following existing files were modified:

- FactorySelector.java — added runtime selection for the Horror family.
- Main.java — added the "4 - Horror" option to the user menu.

## Unchanged business logic

MovieProduction.java was not modified when the Horror family was added.

The existing Visual, Sound, Editing, and MovieProductionFactory interfaces were also not modified.

This shows that a new product family can be added without changing the main business logic.
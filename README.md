# CS501_GroupAssignment2
- Work Done By: Cody, Jevon, and Justin


    o What makes Compose declarative?
    Jetpack Compose is declarative because you describe the UI as functions of state. To change the UI, you call the same composables again with new state/arguments; when state changes, Compose recomposes and updates what’s on screen automatically.
    
        Source: https://developer.android.com/develop/ui/compose/state?utm_source=chatgpt.com
  
    o Where is state stored?
      The Composition UI element states are stored as objects in the `remember`ed variables that are declared within the function scope. These objects are stored in memory similar to any other variable. When the composition is rendered or refreshed, these objects are recalled by Compose and will be updated if there are new changes that affect their state.
  
      Source: https://developer.android.com/develop/ui/compose/state#state-in-composables

    o Which composables are stateful vs stateless?
    In this project, the stateful composables are the ones that own and manage state using remember and mutableStateOf, such as the main screen composable that controls the selected color and slider value. The stateless composables are the child composables that receive their data through parameters and communicate user actions back to the parent through callback functions.
    
        Source: https://developer.android.com/develop/ui/compose/state?utm_source=chatgpt.comhttps://developer.android.com/develop/ui/compose/state?utm_source=chatgpt.com
    o How does this differ from XML + View logic?
    This differs from XML and View-based UI because traditional Android UI development requires imperative updates to views, where developers explicitly modify view properties when data changes. With Jetpack Compose, developers update state instead, and the framework automatically recomposes the UI without implementing code for manually refreshing the UI.
    
        Source: https://developer.android.com/develop/ui/compose/state?utm_source=chatgpt.com


Includes: 
1. Background Color Slider that constantly changes color when the user drags the slider across the screen.
<img width="321" height="668" alt="Screenshot 2026-01-31 at 4 15 13 PM" src="https://github.com/user-attachments/assets/d9417a40-399d-4bc0-bf0f-026f3961ce3e" />

2. Button that switches the selected RGB value when pressed.
<img width="260" alt="image" src="https://github.com/user-attachments/assets/a034a015-cf16-4ac6-8bec-8c6da7c63e34" />
<img width="260" alt="image" src="https://github.com/user-attachments/assets/9900048b-3567-49b1-8aaf-1c4e3f5a400e" />

3. A slider enable/disable toggle was added using a Switch component.
   
<img src="img.png" alt="Slider enabled" width="260" /> &nbsp;
<img src="img_1.png" alt="Slider disabled" width="260" />

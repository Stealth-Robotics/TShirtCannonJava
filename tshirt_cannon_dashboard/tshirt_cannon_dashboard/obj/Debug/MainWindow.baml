   M S B A M L   `   `   `  ����R  Ntshirt_cannon_dashboard, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullA%clr-namespace:tshirt_cannon_dashboardtshirt_cannon_dashboard  5   	   P LStealthDashboardTools, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null\Bclr-namespace:StealthDashboardTools;assembly=StealthDashboardToolsStealthDashboardTools 5   	   (    "tshirt_cannon_dashboard.MainWindow   5   	   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   X TXceed.Wpf.Toolkit, Version=3.1.0.0, Culture=neutral, PublicKeyToken=3e4669d2f30244f43wpf)http://schemas.xceed.com/wpf/xaml/toolkit  5   	   1local%clr-namespace:tshirt_cannon_dashboard  5   	   PStealthBclr-namespace:StealthDashboardTools;assembly=StealthDashboardTools  5   	   -   5          � Title$  Tshirt Dash!��5
   	   $	��350��6   $	��525��6+    � 	Resources 5      1   +tshirt_cannon_dashboard.MainWindowViewModel   VM1  +StealthDashboardTools.BoolToObjectConverter 	 Color   
TrueObject �� Color   FalseObject��%�   &	        &	        5   
   6$     5   
    5      �� 5      $ Green��6"    5      �� 5      $	 Red��6"   5      5      .��5      �  � DataContext# [  6   ��6-   �� *	IsEnabled+ �� 	Converter# [  � RowDefinitions 5   
   �� 5      $
��Auto �6   �� 5      $��* �6   �� 5      $��* �6    � ColumnDefinitions 5   
   �� 5      $��* �6   �� 5      $��* �6   .+�5!   
   �� $��Pressure��6   $��20(�6$   $
��Bold"�62   $��Center=�6D   $��0��6a   $��0��6n   �� 5#   
   $��5q�6   
���   �	 �� CornerRadius$	 5��69   $��3q�6J   $��1��6U   $��0��6b   ._�5$      � .+�5%      �� 
 J� Opacity$

 0.75Q�6   
�������6+   �� 5&      $��10q�6   $��Center=�6)   .+�5'      �� $��Center=�6   $	��200��6:    � Minimum$ 20Q�6F    � Maximum$ 70Q�6S    � Value 6`   �� *TargetPressure+$  Xceed.Wpf.Toolkit.DoubleUpDown  5(      �  �Xceed.Wpf.Toolkit.NumericUpDown`1[[System.Nullable`1[[System.Double, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089]], mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089]]   FormatString$ F3��6'   $��15(�69   �  �Xceed.Wpf.Toolkit.Primitives.UpDownBase`1[[System.Nullable`1[[System.Double, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089]], mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089]]   Minimum$ 20X�6G      Maximum$ 70X�6T      	Increment$ 5X�6a   $	��0 5q�6o      Value 6|   �� *TargetPressure+�� 5)      $��Center=�6    ��6=   �� *OnboardPressure+ �� StringFormat$ Onboard pressure: {0} psi��5*      5+      5,      �� 5.   
   $��Distance��6   $��20(�6$   $
��Bold"�62   $��Center=�6D   $��0��6a   $��1��6n   �� 50   
   $��5q�6   
���   �$	 5��69   $��3q�6J   $��1��6U   $��1��6b   ._�51      � .+�52      �� $

 0.75Q�6   
�������6+   �� 53      $��Center=�6   $��10q�68   .+�54      �� $��Center=�6   $	��200��6:   $ 0Q�6F   $	 108Q�6R    6`   �� *TargetDistance+  55      $ F3��6'   $��15(�69   $ 0X�6G   $	 108X�6S   $ 1X�6a   $	��0 5q�6o    6|   �� *TargetDistance+�� 56      $��Center=�6    ��6=   �� *OnboardDistance+$  Onboard distance: {0} feet��57      58      59      �� 5;   
   $��5q�6   
���   �$	 5��69   $��3q�6J   $��2��6V   $��0��6c   ._�5<      -  'StealthDashboardTools.GearShifterStatus  5=      �� 5?   
   $��5q�6   
���   �$	 5��69   $��3q�6J   $��2��6V   $��1��6c   ._�5@      *   $tshirt_cannon_dashboard.CannonStatus  5A      5B      5C      
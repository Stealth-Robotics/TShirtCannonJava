﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using FRCDash.MVVM;

namespace tshirt_cannon_dashboard
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            //RectStruct size = DashUtil.GetAvailableScreenSpace();
            //if (size.Left != size.Right && size.Top != size.Bottom)
            //{
            //    WindowStartupLocation = WindowStartupLocation.Manual;
            //    Left = size.Left;
            //    Top = size.Top;
            //    Width = size.Right - size.Left;
            //    Height = size.Bottom - size.Top;
            //}
        }

        private void Window_Closed(object sender, EventArgs e)
        {
            Application.Current.Shutdown();
        }
    }
}

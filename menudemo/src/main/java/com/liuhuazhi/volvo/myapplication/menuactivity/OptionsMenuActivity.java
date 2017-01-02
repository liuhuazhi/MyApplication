package com.liuhuazhi.volvo.myapplication.menuactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

import com.liuhuazhi.volvo.myapplication.R;

public class OptionsMenuActivity extends AppCompatActivity {
    private TextView test_txt;
    //普通的的菜单项id
    private static final int NORMAL_MENU = 0;
    //小/中/大字体  子菜单对应的id
    private static final int MINI_TEXTSIZE = 1;
    private static final int MEDIUM_TEXTSIZE = 2;
    private static final int BIG_TEXTSIZE = 3;
    //红/蓝/绿/橙颜色  子菜单项对应的id
    private static final int RED_COLOR = 4;
    private static final int BLUE_COLOR = 5;
    private static final int GREEN_COLOR = 6;
    private static final int ORANGE_COLOR = 7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);
        test_txt = (TextView) findViewById(R.id.options_test_txt);
    }

    //下面四个方法，是对选项菜单进行操作(创建/准备/选择/关闭)后 会调用的方法..可通过重写这些方法 来做对应的处理
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //字体大小   子菜单
        SubMenu txtsize_menu = menu.addSubMenu("字体大小");
        txtsize_menu.setHeaderIcon(R.mipmap.ic_launcher);
        txtsize_menu.setHeaderTitle("请选择字体大小:");
        txtsize_menu.add(1, MINI_TEXTSIZE, 0, "小");
        txtsize_menu.add(1, MEDIUM_TEXTSIZE, 1, "中");
        txtsize_menu.add(1, BIG_TEXTSIZE, 2, "大");
        //普通菜单项
        menu.add(2, NORMAL_MENU, 3, "关闭菜单");
        //字体颜色  子菜单
        SubMenu txtcolor_menu = menu.addSubMenu("字体颜色");
        txtcolor_menu.setHeaderIcon(R.mipmap.ic_launcher);
        txtcolor_menu.setHeaderTitle("请选择字体颜色:");
        txtcolor_menu.add(3, RED_COLOR, 0, "红");
        txtcolor_menu.add(3, BLUE_COLOR, 1, "蓝");
        txtcolor_menu.add(3, GREEN_COLOR, 2, "绿");
        txtcolor_menu.add(3, ORANGE_COLOR, 3, "橙");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MINI_TEXTSIZE:
                test_txt.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10);
                break;
            case MEDIUM_TEXTSIZE:
                test_txt.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                break;
            case BIG_TEXTSIZE:
                test_txt.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20 * 2);
                break;
            case RED_COLOR:
                test_txt.setTextColor(getResources().getColor(android.R.color.holo_red_light));
                break;
            case BLUE_COLOR:
                test_txt.setTextColor(getResources().getColor(android.R.color.holo_blue_light));
                break;
            case GREEN_COLOR:
                test_txt.setTextColor(getResources().getColor(android.R.color.holo_green_light));
                break;
            case ORANGE_COLOR:
                test_txt.setTextColor(getResources().getColor(android.R.color.holo_orange_light));
                break;
            case NORMAL_MENU:
                closeOptionsMenu();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    //在选项菜单关闭时，调用的方法
    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
    }


    //下面三个方法，可通过此来处理选项菜单(打开/初始化/关闭)
    //初始化菜单项，可在别处调用此方法
    @Override
    public void invalidateOptionsMenu() {
        super.invalidateOptionsMenu();
    }

    //打开选项菜单，可在别处通过调用此方法来打开选项菜单
    @Override
    public void openOptionsMenu() {
        super.openOptionsMenu();
    }

    //关闭选项菜单，同样同上，可在其他地方调用
    @Override
    public void closeOptionsMenu() {
        super.closeOptionsMenu();
    }
}

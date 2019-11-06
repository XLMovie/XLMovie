package com.bw.movie.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bw.movie.R;
import com.bw.movie.view.adapter.XLBootPageAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class BootPageActivity extends AppCompatActivity {

    @BindView(R.id.boot_page_view)
    ViewPager bootPageView;
    @BindView(R.id.btn_boot_page)
    Button btnBootPage;
    private Unbinder mBind;
    private List<Integer> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boot_page);
        mBind = ButterKnife.bind(this);


        mList.add(R.drawable.boot_one);
        mList.add(R.drawable.boot_two);
        mList.add(R.drawable.boot_three);
        mList.add(R.drawable.boot_four);

        XLBootPageAdapter xlBootPageAdapter = new XLBootPageAdapter(mList);
        bootPageView.setAdapter(xlBootPageAdapter);
        bootPageView.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if (i == mList.size()-1){
                    btnBootPage.setVisibility(View.VISIBLE);
                }else {
                    btnBootPage.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }

    @OnClick(R.id.btn_boot_page)
    public void onViewClicked() {
        Toast.makeText(this, "体验开始", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBind.unbind();
    }
}

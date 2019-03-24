package pietysz.michal.samsung;


import android.support.annotation.Nullable;
import android.support.design.widget.TabItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter
{

    String[] tabarray = new String[]{"Zapis","Spotkanie"};
    Integer tabnumber = 2;

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    public TabPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
                LeftFragment left_fragment = new LeftFragment();
                return left_fragment;
            case 1:
                RightFragment right_Fragment = new RightFragment();
                return right_Fragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}

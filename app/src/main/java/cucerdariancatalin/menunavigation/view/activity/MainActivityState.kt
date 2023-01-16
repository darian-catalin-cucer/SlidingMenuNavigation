package cucerdariancatalin.menunavigation.view.activity

import cucerdariancatalin.menunavigation.model.NavItemModel

sealed class MainActivityState {
    class ShowNavItems(val navItems: ArrayList<NavItemModel>) : MainActivityState()
    class HandleNavItemClick(val navItem: NavItemModel) : MainActivityState()
}
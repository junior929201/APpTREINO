
if game.PlaceId ==  13230182363 then
    --load
    local OrionLib = loadstring(game:HttpGet(('https://raw.githubusercontent.com/shlexware/Orion/main/source')))()

    local Window = OrionLib:MakeWindow({Name = "junior mods", HidePremium = false, SaveConfig = true, ConfigFolder = "juniorCfg", IntroEnabled = false})

    --[[
    Name = <string> - The name of the UI.
    HidePremium = <bool> - Whether or not the user details shows Premium status or not.
    SaveConfig = <bool> - Toggles the config saving in the UI.
    ConfigFolder = <string> - The name of the folder where the configs are saved.
    IntroEnabled = <bool> - Whether or not to show the intro animation.
    IntroText = <string> - Text to show in the intro animation.
    IntroIcon = <string> - URL to the image you want to use in the intro animation.
    Icon = <string> - URL to the image you want displayed on the window.
    CloseCallback = <function> - Function to execute when the window is closed.
    ]]

    --valor
    _G.Autofrm = true


    --funcao
    function Autofrm()
        while _G.Autofrm == true do
             game:GetService("ReplicatedStorage"):FindFirstChild("events-shared/network@GlobalEvents").placeBlock:FireServer()
             wait(0.1)
        end
    end

    
    --jogador
    local JogadorTab = Window:MakeTab({
        Name = "JOGADOR",
        Icon = "rbxassetid://4483345998",
        PremiumOnly = false
    })

    local Section = JogadorTab:AddSection({
        Name = "AUTO-FARM"
    })

    JogadorTab:AddToggle({
        Name = "AUOTO-FARM",
        Default = false,
        Callback = function(Value)
           _G.Autofrm = value
           Autofrm()
        end    
    })

end